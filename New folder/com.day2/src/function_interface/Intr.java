package function_interface;
@FunctionalInterface
public interface Intr {
public abstract void fun1();

public abstract String toString();

public abstract int hashCode();

//it is a valid interface it contain abstract method but one method is in the obj class it allowed
//
//@FunctionalInterface annotation makes sure that we have a valid FI.
}
