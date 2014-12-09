package com.google.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class am
{
  static void a(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < paramArrayOfByte.length; i++)
      paramArrayOfByte[i] = ((byte)(0x44 ^ paramArrayOfByte[i]));
  }

  public static byte[] a(String paramString)
  {
    byte[] arrayOfByte1 = aq.a(paramString);
    if (arrayOfByte1.length != 32)
      throw new an();
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte1, 4, 16);
    byte[] arrayOfByte2 = new byte[16];
    localByteBuffer.get(arrayOfByte2);
    a(arrayOfByte2);
    return arrayOfByte2;
  }

  public static byte[] a(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte.length != 16)
      throw new an();
    try
    {
      arrayOfByte1 = aq.a(paramString);
      if (arrayOfByte1.length <= 16)
        throw new an();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      byte[] arrayOfByte1;
      throw new an(localNoSuchAlgorithmException);
      ByteBuffer localByteBuffer = ByteBuffer.allocate(arrayOfByte1.length);
      localByteBuffer.put(arrayOfByte1);
      localByteBuffer.flip();
      byte[] arrayOfByte2 = new byte[16];
      byte[] arrayOfByte3 = new byte[-16 + arrayOfByte1.length];
      localByteBuffer.get(arrayOfByte2);
      localByteBuffer.get(arrayOfByte3);
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte, "AES");
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      localCipher.init(2, localSecretKeySpec, new IvParameterSpec(arrayOfByte2));
      byte[] arrayOfByte4 = localCipher.doFinal(arrayOfByte3);
      return arrayOfByte4;
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      throw new an(localInvalidKeyException);
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      throw new an(localIllegalBlockSizeException);
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      throw new an(localNoSuchPaddingException);
    }
    catch (BadPaddingException localBadPaddingException)
    {
      throw new an(localBadPaddingException);
    }
    catch (InvalidAlgorithmParameterException localInvalidAlgorithmParameterException)
    {
      throw new an(localInvalidAlgorithmParameterException);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.am
 * JD-Core Version:    0.6.2
 */