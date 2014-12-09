package com.raon.remotelib;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

public class a
{
  l a;
  private e b;
  private Context c;
  private IrControl d;
  private k e;
  private int f;

  public a(Context paramContext)
  {
    this.c = paramContext;
    this.d = new IrControl(paramContext);
    this.e = new k();
  }

  public ArrayList a(int paramInt)
  {
    if (this.b == null)
      return null;
    return this.b.c(paramInt);
  }

  public void a()
  {
    if (this.a == null)
      return;
    this.a.h = true;
    this.d.a();
  }

  public void a(g paramg, int paramInt)
  {
    int i = paramg.d.a;
    int[] arrayOfInt2;
    if (b.a(i))
    {
      com.raon.remotelib.a.a locala = b.a(paramg, i);
      if (locala != null)
      {
        if (paramg.c == null)
          paramg.c = new c();
        int[] arrayOfInt1 = new int[40];
        for (int n = 0; n < 40; n++)
          arrayOfInt1[n] = 0;
        locala.a(paramg, arrayOfInt1, paramg.c, paramInt);
        arrayOfInt2 = Arrays.copyOfRange(arrayOfInt1, 1, 40);
      }
    }
    try
    {
      a(this.e.a(i).a(38000, arrayOfInt2));
      label358: 
      do
      {
        h localh;
        do
        {
          do
          {
            return;
            localh = paramg.d.a(paramInt);
          }
          while (localh == null);
          if (this.f != 1)
            break;
        }
        while (localh.b.length < 5);
        int j = localh.b[0];
        int k = localh.b[1];
        byte[] arrayOfByte1 = Arrays.copyOfRange(localh.b, 2, 5);
        if (j == 0)
        {
          a(arrayOfByte1, Arrays.copyOfRange(localh.b, 5, localh.b.length), null, j, k);
          return;
        }
        int m = 0xFF & localh.b[5] << 8 | 0xFF & localh.b[6];
        byte[] arrayOfByte2 = Arrays.copyOfRange(localh.b, 7, m + 7);
        byte[] arrayOfByte3 = Arrays.copyOfRange(localh.b, m + 7, localh.b.length);
        if (j == 1)
        {
          a(arrayOfByte1, arrayOfByte2, arrayOfByte3, j, k);
          return;
        }
        if (localh.c)
        {
          a(arrayOfByte1, arrayOfByte3, null, j, k);
          if (localh.c)
            break label358;
        }
        for (boolean bool = true; ; bool = false)
        {
          localh.c = bool;
          return;
          a(arrayOfByte1, arrayOfByte2, null, j, k);
          break;
        }
      }
      while (this.f != 2);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void a(String paramString)
  {
    this.b = new e(this.c, paramString);
    this.f = this.b.b();
  }

  void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt1, int paramInt2)
  {
    if ((this.a != null) && (this.a.isAlive()))
      return;
    this.a = new l(this.d);
    this.a.a(paramArrayOfByte2, paramArrayOfByte3, paramArrayOfByte1, paramInt2, paramInt1);
    this.a.start();
  }

  void a(int[] paramArrayOfInt)
  {
    if ((this.a != null) && (this.a.isAlive()))
      return;
    this.a = new l(this.d);
    this.a.a(paramArrayOfInt);
    this.a.start();
  }

  public int[] b(int paramInt)
  {
    if (this.b == null)
      return null;
    return this.b.d(paramInt);
  }

  public d c(int paramInt)
  {
    if (this.b == null)
      return null;
    return this.b.a(paramInt);
  }

  public g d(int paramInt)
  {
    if (this.b == null)
      return null;
    return this.b.b(paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.a
 * JD-Core Version:    0.6.2
 */