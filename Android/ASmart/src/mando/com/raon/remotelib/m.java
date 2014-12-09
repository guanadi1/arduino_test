package com.raon.remotelib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class m
{
  public String a;
  public int b;
  public int[][] c;
  public int[] d;
  public int[] e;
  public int[] f;
  public int[] g;
  public boolean h;
  public int i;
  public int j;
  public int k;

  public m(int paramInt1, String paramString, int[][] paramArrayOfInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    this.b = paramInt1;
    this.a = paramString;
    this.c = paramArrayOfInt;
    this.d = paramArrayOfInt1;
    this.e = paramArrayOfInt2;
    this.f = paramArrayOfInt3;
    this.g = paramArrayOfInt4;
    this.h = paramBoolean;
    this.i = paramInt2;
    this.j = paramInt3;
    this.k = 1;
  }

  public m(int paramInt1, String paramString, int[][] paramArrayOfInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3, int[] paramArrayOfInt4, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4)
  {
    this.b = paramInt1;
    this.a = paramString;
    this.c = paramArrayOfInt;
    this.d = paramArrayOfInt1;
    this.e = paramArrayOfInt2;
    this.f = paramArrayOfInt3;
    this.g = paramArrayOfInt4;
    this.h = paramBoolean;
    this.i = paramInt2;
    this.j = paramInt3;
    this.k = paramInt4;
  }

  private String a(int paramInt1, int paramInt2)
  {
    for (String str = Integer.toBinaryString(paramInt1); str.length() < 8; str = "0" + str);
    if (this.h)
      str = new StringBuilder(str).reverse().toString();
    if (paramInt2 < 8)
    {
      if (this.h)
        str = str.substring(0, paramInt2);
    }
    else
      return str;
    return str.substring(8 - paramInt2, 8);
  }

  public int[] a(int paramInt, int[] paramArrayOfInt)
  {
    int m = 0;
    double d1 = 1000000.0D * (1.0D / paramInt);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(paramInt));
    int n = 0;
    int i1 = 0;
    while (n < this.g.length)
    {
      int i8 = this.f[n];
      if (this.g[n] == 1)
      {
        int[] arrayOfInt3 = this.c[i8];
        for (int i14 = 0; i14 < arrayOfInt3.length; i14++)
          localArrayList.add(Integer.valueOf((int)(arrayOfInt3[i14] / d1)));
      }
      if (this.g[n] == 0)
      {
        int i9 = i1 + 1;
        char[] arrayOfChar = a(paramArrayOfInt[i1], i8).toCharArray();
        int i10 = arrayOfChar.length;
        for (int i11 = 0; i11 < i10; i11++)
        {
          if (Character.getNumericValue(arrayOfChar[i11]) == 1)
            for (int i13 = 0; i13 < this.e.length; i13++)
              localArrayList.add(Integer.valueOf((int)(this.e[i13] / d1)));
          for (int i12 = 0; i12 < this.d.length; i12++)
            localArrayList.add(Integer.valueOf((int)(this.d[i12] / d1)));
        }
        i1 = i9;
      }
      n++;
    }
    int i2 = ((Integer)Collections.min(localArrayList)).intValue();
    localArrayList.add(Integer.valueOf(i2));
    if (this.i > 0)
    {
      Iterator localIterator = localArrayList.iterator();
      int i6 = 0;
      while (localIterator.hasNext())
        i6 += ((Integer)localIterator.next()).intValue();
      int i7 = (int)(this.i / d1) - (i6 - paramInt);
      if (i7 < 0)
        i7 = i2 * 3;
      localArrayList.add(Integer.valueOf(i7));
    }
    while (this.k > 1)
    {
      int[] arrayOfInt2 = new int[localArrayList.size()];
      int i3 = 1;
      while (true)
        if (i3 < localArrayList.size())
        {
          arrayOfInt2[(i3 - 1)] = ((Integer)localArrayList.get(i3)).intValue();
          i3++;
          continue;
          if (this.j > 0)
          {
            int i5 = (int)(this.j / d1) - i2;
            if (i5 < 0)
              i5 = i2;
            localArrayList.add(Integer.valueOf(i5));
            break;
          }
          localArrayList.add(Integer.valueOf(i2));
          break;
        }
      for (int i4 = 0; i4 < arrayOfInt2.length; i4++)
        localArrayList.add(Integer.valueOf(arrayOfInt2[i4]));
    }
    int[] arrayOfInt1 = new int[localArrayList.size()];
    while (m < localArrayList.size())
    {
      arrayOfInt1[m] = ((Integer)localArrayList.get(m)).intValue();
      m++;
    }
    return arrayOfInt1;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.m
 * JD-Core Version:    0.6.2
 */