public final class CrashedFinalizable { 
@Override
public void finalize() { // +1 VIOLATION 
System.out.print("");
}
}

public class CrashedFinalizable_2 { 
@Override
def finalize() { // +1 VIOLATION (public is the default visibility)
System.out.print("");
}
}
