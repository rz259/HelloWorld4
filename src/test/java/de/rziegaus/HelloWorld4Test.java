package de.rziegaus;


import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorld4Test
{
  @Test
  public void testAlwaysTrue()
  {
    assertTrue(true);
  }

  @Test
  public void testGreeting()
  {
    assertEquals(Main.getGreeting(), "Hello World 4");
  }
}
