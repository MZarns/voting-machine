let stompClient = null;
let playerName = "spectator";

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
        $("#playerTable").show();
    }
    else {
        $("#conversation").hide();
        $("#playerTable").hide();
    }
    $("#greetings").html("");
    $("#playerList").html("");
}

function connect() {
    let socket = new SockJS('/voting-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/greetings', function (message) {
            showGreeting(JSON.parse(message.body).content);
        });
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
        playerName = "spectator"
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendName() {
    if (playerName == "spectator") {
        playerName = $("#name").val();
        stompClient.send("/app/hello", {}, JSON.stringify({'name': playerName}));
        stompClient.send("/app/playerCheck", {}, JSON.stringify({'name': playerName}));
    }
}

function sendMessage() {
    let tempMessage = playerName + ": " + $("#message").val();
    stompClient.send("/app/message", {}, JSON.stringify({'message': tempMessage}))
}

function showGreeting(message) {
    $("#greetings").append("<tr><td>" + message + "</td></tr>");
}

function showPlayers(playerList) {
    $("#playerList").empty()
    $("#playerList").html(playerList);
}

    // let body = document.getElementsByTagName('body')[0];
    // let tbl = document.createElement('table');
    // tbl.style.width = '100%';
    // tbl.setAttribute('border', '1');
    // let tbdy = document.createElement('tbody');
    // for (let i = 0; i < 3; i++) {
    //     let tr = document.createElement('tr');
    //     for (let j = 0; j < 2; j++) {
    //         if (i == 2 && j == 1) {
    //             break
    //         } else {
    //             let td = document.createElement('td');
    //             td.appendChild(document.createTextNode('\u0020'))
    //             i == 1 && j == 1 ? td.setAttribute('rowSpan', '2') : null;
    //             tr.appendChild(td)
    //         }
    //     }
    //     tbdy.appendChild(tr);
    // }
    // tbl.appendChild(tbdy);
    // body.appendChild(tbl)

    // let players = playerList.trim().split(/\s+/);
    // $("#playerList").remove()
    // for (let j = 0; j < players.size; j++) {
    //     $("#playerList").append("<tr><td>" + players[j] + "</td></tr>");
    // }

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#connect" ).click(function() { connect(); });
    $( "#disconnect" ).click(function() { disconnect(); });
    $( "#sendName" ).click(function() { sendName(); });
    $( "#sendMessage" ).click(function () { sendMessage(); });
});
