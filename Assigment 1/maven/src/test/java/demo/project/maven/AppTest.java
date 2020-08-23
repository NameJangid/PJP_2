package demo.project.maven;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void simpleTest(){
    	assertEquals(4,App.multiply(2));
    	
    }
}
