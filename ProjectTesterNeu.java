package se_02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProjectTesterNeu {
  ProjectNeu simple_example, simple_cycle, complex_cycle, complex_graph;

  @Before
  public void setUp(){
    simple_example = new ProjectNeu(
        new int[][]{{1, 3}, {3, 4}, {2, 3}}
    );
    simple_cycle = new ProjectNeu(new int[][]{{1, 1}});
    complex_cycle = new ProjectNeu(new int[][]{{1, 2}, {2, 1}});
    complex_graph = new ProjectNeu(
        new int[][]{
            {1, 3}, {3, 4}, {2, 3},
            {1, 5}, {2, 6}, {5, 7},
            {4, 7}, {6, 7}, {3, 5},
            {3, 6}
          }
    );
  }
  
  public void test1() {
	    assertTrue(simple_example.isWellSorted(new int[]{1, 2, 3, 4}));  
  }
  
  public void test2() {
	    assertFalse(simple_example.isWellSorted(new int[]{3, 1, 4, 2}));  
}
  
  public void test3() {
	    assertFalse(simple_example.isWellSorted(new int[]{1, 1}));  
}
  
  public void test4() {
	    assertFalse(simple_example.isWellSorted(new int[]{2, 3, 4, 2}));  
}
  
  public void test5() {
	    assertTrue(simple_cycle.isWellSorted(new int[]{1, 2, 3}));  
}
  
  public void test6() {
	    assertTrue(complex_graph.isWellSorted(new int[]{2, 1, 3, 4, 6}));  
}      