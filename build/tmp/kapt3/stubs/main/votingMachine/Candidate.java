package votingMachine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"LvotingMachine/Candidate;", "", "name", "", "party", "ballots", "Ljava/util/ArrayList;", "LvotingMachine/Ballot;", "Lkotlin/collections/ArrayList;", "victorious", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Z)V", "toString", "Companion", "voting-machine"})
public final class Candidate {
    private final java.lang.String name = null;
    private final java.lang.String party = null;
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
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\u0006\u00a8\u0006\n"}, d2 = {"LvotingMachine/Candidate$Companion;", "", "()V", "candidateFromString", "LvotingMachine/Candidate;", "candidateString", "", "parseCandidateLine", "", "candidateLine", "voting-machine"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<votingMachine.Candidate> parseCandidateLine(@org.jetbrains.annotations.NotNull
        java.lang.String candidateLine) {
            return null;
        }
        
        private final votingMachine.Candidate candidateFromString(java.lang.String candidateString) {
            return null;
        }
    }
}