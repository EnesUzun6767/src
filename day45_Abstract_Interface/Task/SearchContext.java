package day45_Abstract_Interface.Task;

public interface SearchContext {
   public abstract void findElement(String locator);// public and abstract by default
    public  abstract void findElements(String locator);
}
