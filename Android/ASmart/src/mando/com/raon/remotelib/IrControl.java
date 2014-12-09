package com.raon.remotelib;

import android.content.Context;
import android.os.Handler;
import com.a.a.a;
import com.raon.aremotefreegalaxy.Globals;

class IrControl
{
  Object a = null;
  a b = null;
  Object c = null;
  Globals d;

  static
  {
    System.loadLibrary("remotelib-jni");
  }

  public IrControl(Context paramContext)
  {
    this.c = paramContext.getSystemService("consumer_ir");
    this.a = paramContext.getSystemService("irda");
    if (this.c == null);
    try
    {
      this.b = new a(paramContext, new Handler());
      if (this.b != null)
        this.b.a();
      label79: this.d = ((Globals)paramContext.getApplicationContext());
      return;
    }
    catch (Exception localException)
    {
      break label79;
    }
  }

  public native int SendIR(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3, byte[] paramArrayOfByte3, Object paramObject, int paramInt4);

  public native int SendIRraw(int[] paramArrayOfInt, int paramInt1, Object paramObject, int paramInt2);

  public void a()
  {
    if (this.b != null)
      this.b.b();
  }

  public void a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt)
  {
    int i;
    if (paramArrayOfByte3 == null)
    {
      i = 0;
      if (this.b == null)
        break label41;
      SendIR(paramArrayOfByte2, paramArrayOfByte2.length, paramArrayOfByte3, i, paramInt, paramArrayOfByte1, this.b, 2);
    }
    label41: 
    do
    {
      return;
      i = paramArrayOfByte3.length;
      break;
      if (this.c != null)
      {
        int j = paramArrayOfByte2.length;
        Object localObject = this.c;
        if (this.d.e);
        for (int k = 1; ; k = 0)
        {
          SendIR(paramArrayOfByte2, j, paramArrayOfByte3, i, paramInt, paramArrayOfByte1, localObject, k);
          return;
        }
      }
    }
    while (this.a == null);
    SendIR(paramArrayOfByte2, paramArrayOfByte2.length, paramArrayOfByte3, i, paramInt, paramArrayOfByte1, this.a, 3);
  }

  public void a(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length < 2);
    do
    {
      return;
      if (this.b != null)
      {
        SendIRraw(paramArrayOfInt, paramArrayOfInt.length, this.b, 2);
        return;
      }
      if (this.c != null)
      {
        int i = paramArrayOfInt.length;
        Object localObject = this.c;
        if (this.d.e);
        for (int j = 1; ; j = 0)
        {
          SendIRraw(paramArrayOfInt, i, localObject, j);
          return;
        }
      }
    }
    while (this.a == null);
    SendIRraw(paramArrayOfInt, paramArrayOfInt.length, this.a, 3);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.IrControl
 * JD-Core Version:    0.6.2
 */