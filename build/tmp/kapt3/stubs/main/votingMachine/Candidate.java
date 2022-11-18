package votingMachine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0003H\u0016R*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2 = {"LvotingMachine/Candidate;", "", "name", "", "party", "ballots", "Ljava/util/ArrayList;", "LvotingMachine/Ballot;", "Lkotlin/collections/ArrayList;", "victorious", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V", "getBallots", "()Ljava/util/ArrayList;", "setBallots", "(Ljava/util/ArrayList;)V", "getVictorious", "()Z", "setVictorious", "(Z)V", "toString", "Companion", "voting-machine"})
public final class Candidate {
    private final java.lang.String name = null;
    private final java.lang.String party = null;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<votingMachine.Ballot> ballots;
    private boolean victorious;
    @org.jetbrains.annotations.NotNull
    public static final votingMachine.Candidate.Companion Companion = null;
    
    public Candidate(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String party, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<votingMachine.Ballot> ballots, boolean victorious) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<votingMachine.Ballot> getBallots() {
        return null;
    }
    
    public final void setBallots(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<votingMachine.Ballot> p0) {
    }
    
    public final boolean getVictorious() {
        return false;
    }
    
    public final void setVictorious(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\t2\u0006\u0010\n\u001a\u00020\u0006\u00a8\u0006\u000b"}, d2 = {"LvotingMachine/Candidate$Companion;", "", "()V", "candidateFromString", "LvotingMachine/Candidate;", "candidateString", "", "parseCandidateLine", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "candidateLine", "voting-machine"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<votingMachine.Candidate> parseCandidateLine(@org.jetbrains.annotations.NotNull
        java.lang.String candidateLine) {
            return null;
        }
        
        private final votingMachine.Candidate candidateFromString(java.lang.String candidateString) {
            return null;
        }
    }
}