package com.google.ads.e;

public class l
{
  static
  {
    if (!l.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      return;
    }
  }

  public static byte[] a(String paramString)
  {
    return a(paramString.getBytes(), 0);
  }

  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }

  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    n localn = new n(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (!localn.a(paramArrayOfByte, paramInt1, paramInt2, true))
      throw new IllegalArgumentException("bad base-64");
    if (localn.b == localn.a.length)
      return localn.a;
    byte[] arrayOfByte = new byte[localn.b];
    System.arraycopy(localn.a, 0, arrayOfByte, 0, localn.b);
    return arrayOfByte;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.e.l
 * JD-Core Version:    0.6.2
 */