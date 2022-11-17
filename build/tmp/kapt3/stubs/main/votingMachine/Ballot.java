package votingMachine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"LvotingMachine/Ballot;", "", "preferencesArray", "", "([I)V", "preferences", "get", "toString", "", "Companion", "voting-machine"})
public final class Ballot {
    private int[] preferences;
    @org.jetbrains.annotations.NotNull
    public static final votingMachine.Ballot.Companion Companion = null;
    
    public Ballot(@org.jetbrains.annotations.NotNull
    int[] preferencesArray) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final int[] get() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"LvotingMachine/Ballot$Companion;", "", "()V", "ballotFromString", "LvotingMachine/Ballot;", "ballotString", "", "voting-machine"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final votingMachine.Ballot ballotFromString(@org.jetbrains.annotations.NotNull
        java.lang.String ballotString) {
            return null;
        }
    }
}