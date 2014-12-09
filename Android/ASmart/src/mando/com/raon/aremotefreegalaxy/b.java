package com.raon.aremotefreegalaxy;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.raon.remotelib.d;
import com.raon.remotelib.f;
import com.raon.remotelib.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;

public class b extends SQLiteOpenHelper
{
  Globals a;
  private SQLiteDatabase b;
  private final Context c;

  public b(Context paramContext)
  {
    super(paramContext, "configs.db", null, 1);
    this.c = paramContext;
    this.a = ((Globals)this.c);
    try
    {
      a("configs.db", "configs.db");
      a();
      return;
    }
    catch (Exception localException)
    {
      while (true)
        Log.i("raon", localException.toString());
    }
  }

  private void a(String paramString1, String paramString2)
  {
    String str = this.c.getDatabasePath(paramString2).getPath();
    if (!new File(str).exists())
    {
      InputStream localInputStream = this.c.getAssets().open(paramString1);
      FileOutputStream localFileOutputStream = new FileOutputStream(str);
      byte[] arrayOfByte = new byte[1024];
      int i = 0;
      while (true)
      {
        int j = localInputStream.read(arrayOfByte);
        if (j <= 0)
          break;
        localFileOutputStream.write(arrayOfByte, 0, j);
        i += j;
      }
      localFileOutputStream.flush();
      localFileOutputStream.close();
      localInputStream.close();
    }
  }

  public void a()
  {
    this.b = SQLiteDatabase.openDatabase(this.c.getDatabasePath("configs.db").getPath(), null, 16);
  }

  public void a(ArrayList paramArrayList)
  {
    this.b.delete("room", null, null);
    this.b.delete("device", null, null);
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      ad localad = (ad)paramArrayList.get(i);
      Locale localLocale1 = Locale.US;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Integer.valueOf(i);
      arrayOfObject1[1] = localad.a.replace("'", "''");
      arrayOfObject1[2] = Integer.valueOf(localad.b);
      String str1 = String.format(localLocale1, "insert into room (id,name,selected) values (%d,'%s',%d)", arrayOfObject1);
      this.b.execSQL(str1);
      for (int j = 0; j < localad.c.size(); j++)
      {
        f localf = (f)localad.c.get(j);
        Locale localLocale2 = Locale.US;
        Object[] arrayOfObject2 = new Object[4];
        arrayOfObject2[0] = Integer.valueOf(i);
        arrayOfObject2[1] = localf.a.replace("'", "''");
        arrayOfObject2[2] = Integer.valueOf(localf.b);
        arrayOfObject2[3] = Integer.valueOf(localf.d.a);
        String str2 = String.format(localLocale2, "insert into device (roomid,name,cid,mid) values (%d,'%s',%d,%d)", arrayOfObject2);
        this.b.execSQL(str2);
      }
    }
  }

  public ArrayList b()
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      Cursor localCursor1 = this.b.rawQuery("select * from room order by id", null);
      if (localCursor1.getCount() > 0)
        while (localCursor1.moveToNext())
        {
          ad localad = new ad(localCursor1.getString(1));
          localad.b = localCursor1.getInt(2);
          localArrayList.add(localad);
        }
      localCursor1.close();
      Cursor localCursor2 = this.b.rawQuery("select * from device order by id", null);
      if (localCursor2.getCount() > 0)
        while (localCursor2.moveToNext())
        {
          localCursor2.getInt(0);
          int i = localCursor2.getInt(1);
          String str = localCursor2.getString(2);
          int j = localCursor2.getInt(3);
          int k = localCursor2.getInt(4);
          g localg = this.a.f(k);
          if (localg != null)
          {
            d locald = this.a.e(localg.b);
            if (locald != null)
            {
              f localf = new f();
              localf.a = str;
              localf.b = j;
              localf.c = locald;
              localf.d = localg;
              ((ad)localArrayList.get(i)).c.add(localf);
            }
          }
        }
    }
    catch (Exception localException)
    {
    }
    return localArrayList;
  }

  public void close()
  {
    try
    {
      if (this.b != null)
        this.b.close();
      super.close();
      return;
    }
    finally
    {
    }
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.b
 * JD-Core Version:    0.6.2
 */