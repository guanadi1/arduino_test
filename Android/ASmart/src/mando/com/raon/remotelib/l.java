package com.raon.remotelib;

class l extends Thread
{
  IrControl a;
  int b;
  byte[] c;
  byte[] d;
  byte[] e;
  int[] f;
  int g;
  boolean h;

  public l(IrControl paramIrControl)
  {
    this.a = paramIrControl;
  }

  public void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt1, int paramInt2)
  {
    this.c = paramArrayOfByte1;
    this.d = paramArrayOfByte2;
    this.e = paramArrayOfByte3;
    this.g = paramInt1;
    this.b = paramInt2;
    this.f = null;
  }

  public void a(int[] paramArrayOfInt)
  {
    this.f = paramArrayOfInt;
    this.c = null;
    this.d = null;
    this.e = null;
    this.b = 3;
  }

  public void run()
  {
    try
    {
      if (this.b == 3)
        this.a.a(this.f);
      while (true)
      {
        int i;
        if ((i < 7) && (!this.h))
        {
          Thread.sleep(100L);
          i++;
          continue;
          if (this.b == 1)
            this.a.a(this.e, this.c, this.d, this.g);
          else
            this.a.a(this.e, this.c, null, this.g);
        }
        else
        {
          while (!this.h)
            if (this.b == 3)
              this.a.a(this.f);
            else if (this.b == 1)
              this.a.a(this.e, this.c, this.d, 1);
            else
              this.a.a(this.e, this.c, null, 1);
          i = 0;
        }
      }
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.l
 * JD-Core Version:    0.6.2
 */