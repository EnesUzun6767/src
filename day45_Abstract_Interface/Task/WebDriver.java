package day45_Abstract_Interface.Task;

import day45_Abstract_Interface.Task.SearchContext;

public interface WebDriver extends SearchContext {

   void  get(String url);
   void close();
   void quit();
   void getTitle();
}
