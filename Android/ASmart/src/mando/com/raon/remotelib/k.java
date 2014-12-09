package com.raon.remotelib;

import java.util.ArrayList;
import java.util.Iterator;

class k
{
  public static ArrayList a;

  public k()
  {
    a = new ArrayList();
    a.add(new m(17, "samsung3", new int[][] { { 3000, 9000 } }, new int[] { 500, 500 }, new int[] { 500, 1500 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(18, "lg2", new int[][] { { 8500, 4000 } }, new int[] { 500, 500 }, new int[] { 500, 1500 }, new int[] { 0, 8, 8, 8, 4 }, new int[] { 1, 0, 0, 0, 0 }, false, 0, 0));
    a.add(new m(19, "carrier1", new int[][] { { 8300, 4200 } }, new int[] { 500, 500 }, new int[] { 500, 1500 }, new int[] { 0, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(27, "gree9", new int[][] { { 9000, 4500 }, { 550, 20000 } }, new int[] { 550, 550 }, new int[] { 550, 1660 }, new int[] { 0, 8, 8, 8, 8, 3, 1, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(30, "gree6", new int[][] { { 9000, 4500 } }, new int[] { 550, 550 }, new int[] { 550, 1660 }, new int[] { 0, 8, 8, 8, 8, 3 }, new int[] { 1, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(40, "galanz_mitsubishi", new int[][] { { 3700, 1500 } }, new int[] { 500, 500 }, new int[] { 500, 1200 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(41, "tcl", new int[][] { { 3000, 1720 } }, new int[] { 450, 480 }, new int[] { 450, 1150 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(21, "media", new int[][] { { 4400, 4400 }, { 550, 5200, 4400, 4400 } }, new int[] { 550, 550 }, new int[] { 550, 1600 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 1, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(42, "chigo", new int[][] { { 6100, 7400 }, { 555, 7400 } }, new int[] { 555, 1400 }, new int[] { 555, 3340 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 1 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 1 }, true, 0, 0));
    a.add(new m(43, "kelong", new int[][] { { 9000, 4500 } }, new int[] { 560, 560 }, new int[] { 560, 1680 }, new int[] { 0, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(46, "acuma", new int[][] { { 3000, 4300 } }, new int[] { 500, 500 }, new int[] { 500, 1600 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(45, "haier6", new int[][] { { 3000, 3000, 3000, 4500 } }, new int[] { 550, 550 }, new int[] { 550, 1660 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(51, "haier2", new int[][] { { 800, 3300 }, { 630, 3300 } }, new int[] { 630, 630 }, new int[] { 630, 1670 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 4, 1 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 1 }, false, 0, 0));
    a.add(new m(48, "changhong4", new int[][] { { 8400, 4200 } }, new int[] { 520, 520 }, new int[] { 520, 1620 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(49, "daikin3", new int[][] { { 3500, 1700 }, { 460, 29540, 3500, 1700 } }, new int[] { 460, 530 }, new int[] { 460, 1300 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 1, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(50, "sanyo2", new int[][] { { 3600, 2400 } }, new int[] { 600, 600 }, new int[] { 600, 1800 }, new int[] { 0, 8, 8, 7, 8 }, new int[] { 1, 0, 0, 0, 0 }, true, 0, 9000, 2));
    a.add(new m(44, "mitsubishi1", new int[][] { { 3400, 1600 } }, new int[] { 450, 450 }, new int[] { 450, 1250 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(52, "rowa", new int[][] { { 3500, 3700 }, { 840, 13700 } }, new int[] { 840, 840 }, new int[] { 840, 2560 }, new int[] { 0, 8, 8, 8, 8, 8, 1 }, new int[] { 1, 0, 0, 0, 0, 0, 1 }, true, 0, 0));
    a.add(new m(53, "fujitsu4", new int[][] { { 3370, 1500 } }, new int[] { 450, 350 }, new int[] { 450, 1150 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(54, "hitachi2", new int[][] { { 3300, 3300 } }, new int[] { 550, 550 }, new int[] { 550, 1200 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(55, "sanyo4", new int[][] { { 3300, 1650 } }, new int[] { 410, 410 }, new int[] { 410, 1230 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(56, "xinge", new int[][] { { 3300, 1650 } }, new int[] { 420, 420 }, new int[] { 420, 1200 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(57, "sharp4", new int[][] { { 3700, 1900 } }, new int[] { 460, 500 }, new int[] { 460, 1400 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(58, "shinco2", new int[][] { { 1000, 11000 }, { 1000, 40000 } }, new int[] { 1000, 3000 }, new int[] { 1000, 7000 }, new int[] { 0, 8, 1, 0, 8, 1, 0, 8, 1, 0, 8, 1, 0, 8, 1, 0 }, new int[] { 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0 }, false, 0, 0));
    a.add(new m(47, "aux7", new int[][] { { 9000, 4500 } }, new int[] { 560, 560 }, new int[] { 560, 1670 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(59, "yuetu", new int[][] { { 3500, 1800 } }, new int[] { 500, 500 }, new int[] { 500, 1250 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, true, 0, 0));
    a.add(new m(60, "hisense1", new int[][] { { 500, 3500 } }, new int[] { 450, 560 }, new int[] { 450, 1500 }, new int[] { 0, 8, 8, 8, 8, 8, 8, 4, 0, 3 }, new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0 }, false, 0, 0));
  }

  public m a(int paramInt)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      if (localm.b == paramInt)
        return localm;
    }
    return null;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.k
 * JD-Core Version:    0.6.2
 */