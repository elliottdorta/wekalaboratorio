package com.ldh.weka.ProyectoFinal_LDH;

import javax.swing.JButton;
import javax.swing.JTextArea;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    /**
     * Comprueba botones
     */
    public void test1() {
    	interfazGrafica i = new interfazGrafica();
    	
    	assertTrue(i.btnAbrir.getClass() == JButton.class);
    }

    public void test2() {
    	interfazGrafica i = new interfazGrafica();
    	
    	assertTrue(i.btnJ.getClass() == JButton.class);
    }

    public void test3() {
    	interfazGrafica i = new interfazGrafica();
    	
    	assertTrue(i.btnKstart.getClass() == JButton.class);
    }

    public void test4() {
    	interfazGrafica i = new interfazGrafica();
    	
    	assertTrue(i.btnMp.getClass() == JButton.class);
    }

    public void test5() {
    	interfazGrafica i = new interfazGrafica();
    	
    	assertTrue(i.btnNewButton.getClass() == JButton.class);
    }

    public void test6() {
    	interfazGrafica i = new interfazGrafica();
    	
    	assertTrue(i.btnRamdonForest.getClass() == JButton.class);
    }

    public void test7() {
    	interfazGrafica i = new interfazGrafica();
    	
    	assertTrue(i.btnRegresinM.getClass() == JButton.class);
    }

    public void test8() {
    	interfazGrafica i = new interfazGrafica();
    	
    	assertTrue(i.btnRegresionS.getClass() == JButton.class);
    }

    public void test9() {
    	interfazGrafica i = new interfazGrafica();
    	
    	assertTrue(i.btnZeror.getClass() == JButton.class);
    }
    
    /**
     * Comprobacion JTextArea
     */
    public void test10() {
    	interfazGrafica i = new interfazGrafica();
    	
    	assertTrue(i.textArea.getClass() == JTextArea.class);
    }
    
    public void test11() {
    	interfazGrafica i = new interfazGrafica();
    	
    	assertTrue(i.textArea_1.getClass() == JTextArea.class);
    }
}
