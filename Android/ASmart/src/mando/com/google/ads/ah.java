package com.google.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public abstract class ah
  implements ag
{
  protected MotionEvent a = null;
  protected DisplayMetrics b = null;
  private aw c = null;
  private ByteArrayOutputStream d = null;

  protected ah(Context paramContext)
  {
    try
    {
      this.b = paramContext.getResources().getDisplayMetrics();
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      this.b = new DisplayMetrics();
      this.b.density = 1.0F;
    }
  }

  private String a(Context paramContext, String paramString, boolean paramBoolean)
  {
    try
    {
      a();
      if (paramBoolean)
        c(paramContext);
      while (true)
      {
        arrayOfByte = b();
        if (arrayOfByte.length != 0)
          break;
        return Integer.toString(5);
        b(paramContext);
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      byte[] arrayOfByte;
      return Integer.toString(7);
      String str = a(arrayOfByte, paramString);
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return Integer.toString(7);
    }
    catch (IOException localIOException)
    {
    }
    return Integer.toString(3);
  }

  private void a()
  {
    this.d = new ByteArrayOutputStream();
    this.c = aw.a(this.d);
  }

  private byte[] b()
  {
    this.c.a();
    return this.d.toByteArray();
  }

  public String a(Context paramContext)
  {
    return a(paramContext, null, false);
  }

  public String a(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, true);
  }

  String a(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte.length > 239)
    {
      a();
      a(20, 1L);
      paramArrayOfByte = b();
    }
    byte[] arrayOfByte5;
    if (paramArrayOfByte.length < 239)
    {
      arrayOfByte5 = new byte[239 - paramArrayOfByte.length];
      new SecureRandom().nextBytes(arrayOfByte5);
    }
    for (byte[] arrayOfByte1 = ByteBuffer.allocate(240).put((byte)paramArrayOfByte.length).put(paramArrayOfByte).put(arrayOfByte5).array(); ; arrayOfByte1 = ByteBuffer.allocate(240).put((byte)paramArrayOfByte.length).put(paramArrayOfByte).array())
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(arrayOfByte1);
      byte[] arrayOfByte2 = localMessageDigest.digest();
      byte[] arrayOfByte3 = ByteBuffer.allocate(256).put(arrayOfByte2).put(arrayOfByte1).array();
      byte[] arrayOfByte4 = new byte[256];
      new q().a(arrayOfByte3, arrayOfByte4);
      if ((paramString != null) && (paramString.length() > 0))
        a(paramString, arrayOfByte4);
      return aq.a(arrayOfByte4, false);
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.a != null)
      this.a.recycle();
    this.a = MotionEvent.obtain(0L, paramInt3, 1, paramInt1 * this.b.density, paramInt2 * this.b.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
  }

  protected void a(int paramInt, long paramLong)
  {
    this.c.a(paramInt, paramLong);
  }

  protected void a(int paramInt, String paramString)
  {
    this.c.a(paramInt, paramString);
  }

  public void a(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 1)
    {
      if (this.a != null)
        this.a.recycle();
      this.a = MotionEvent.obtain(paramMotionEvent);
    }
  }

  void a(String paramString, byte[] paramArrayOfByte)
  {
    if (paramString.length() > 32)
      paramString = paramString.substring(0, 32);
    new ar(paramString.getBytes("UTF-8")).a(paramArrayOfByte);
  }

  protected abstract void b(Context paramContext);

  protected abstract void c(Context paramContext);
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.ah
 * JD-Core Version:    0.6.2
 */