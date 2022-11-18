package votingMachine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\t\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u00c6\u0003J\u0019\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tH\u00c6\u0003JQ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"LvotingMachine/ElectionDTO;", "", "electionType", "", "numAvailableSeats", "", "candidateList", "Ljava/util/ArrayList;", "LvotingMachine/Candidate;", "Lkotlin/collections/ArrayList;", "ballotList", "LvotingMachine/Ballot;", "(Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;)V", "getBallotList", "()Ljava/util/ArrayList;", "getCandidateList", "getElectionType", "()Ljava/lang/String;", "getNumAvailableSeats", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "voting-machine"})
public final class ElectionDTO {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String electionType = null;
    private final int numAvailableSeats = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<votingMachine.Candidate> candidateList = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<votingMachine.Ballot> ballotList = null;
    
    @org.jetbrains.annotations.NotNull
    public final votingMachine.ElectionDTO copy(@org.jetbrains.annotations.NotNull
    java.lang.String electionType, int numAvailableSeats, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<votingMachine.Candidate> candidateList, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<votingMachine.Ballot> ballotList) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ElectionDTO(@org.jetbrains.annotations.NotNull
    java.lang.String electionType, int numAvailableSeats, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<votingMachine.Candidate> candidateList, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<votingMachine.Ballot> ballotList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getElectionType() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getNumAvailableSeats() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<votingMachine.Candidate> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<votingMachine.Candidate> getCandidateList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<votingMachine.Ballot> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<votingMachine.Ballot> getBallotList() {
        return null;
    }
}