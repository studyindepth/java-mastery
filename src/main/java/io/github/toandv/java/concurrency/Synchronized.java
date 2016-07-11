package io.github.toandv.java.concurrency;

/**
 * Created by toan on 6/23/16.
 */
public interface Synchronized {
     default void  sync() {
         synchronized(this) {

         }
     }
}
