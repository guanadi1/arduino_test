package com.raon.remotelib;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

class e extends SQLiteOpenHelper
{
  private String a;
  private SQLiteDatabase b;
  private final Context c;

  public e(Context paramContext, String paramString)
  {
    super(paramContext, "raon.db", null, 1);
    this.c = paramContext;
    this.a = paramString;
    a();
  }

  private j f(int paramInt)
  {
    boolean bool1 = true;
    Cursor localCursor = this.b.rawQuery("SELECT * FROM dvmd WHERE id = " + paramInt, null);
    int i = localCursor.getCount();
    Object localObject = null;
    j localj;
    String str;
    boolean bool2;
    boolean bool3;
    label187: boolean bool4;
    label205: boolean bool5;
    if (i > 0)
    {
      localCursor.moveToFirst();
      localj = new j();
      str = localCursor.getString(2);
      if ((str != null) && (str.length() == 10))
      {
        localj.a = Integer.parseInt(str.substring(0, 2), 16);
        localj.b = Integer.parseInt(str.substring(2, 4), 16);
        localj.c = Integer.parseInt(str.substring(4, 6), 16);
        int j = Integer.parseInt(str.substring(6, 8), 16);
        if ((j & 0x10) != 16)
          break label286;
        bool2 = bool1;
        localj.d = bool2;
        if ((j & 0x8) != 8)
          break label292;
        bool3 = bool1;
        localj.f = bool3;
        if ((j & 0x4) != 4)
          break label298;
        bool4 = bool1;
        localj.e = bool4;
        if ((j & 0x2) != 2)
          break label304;
        bool5 = bool1;
        label223: localj.g = bool5;
        if ((j & 0x1) != bool1)
          break label310;
      }
    }
    while (true)
    {
      localj.h = bool1;
      localj.i = Integer.parseInt(str.substring(8, 10), 16);
      localj.j = e(paramInt);
      localObject = localj;
      localCursor.close();
      return localObject;
      label286: bool2 = false;
      break;
      label292: bool3 = false;
      break label187;
      label298: bool4 = false;
      break label205;
      label304: bool5 = false;
      break label223;
      label310: bool1 = false;
    }
  }

  public d a(int paramInt)
  {
    Cursor localCursor = this.b.rawQuery("SELECT * FROM brand WHERE id = " + paramInt, null);
    int i = localCursor.getCount();
    d locald = null;
    if (i > 0)
    {
      localCursor.moveToFirst();
      locald = new d();
      locald.a = localCursor.getInt(0);
      locald.c = localCursor.getString(1);
      locald.b = localCursor.getInt(2);
      locald.d = localCursor.getInt(3);
    }
    localCursor.close();
    return locald;
  }

  public void a()
  {
    this.b = SQLiteDatabase.openDatabase(this.a, null, 16);
  }

  public int b()
  {
    Cursor localCursor = this.b.rawQuery("SELECT rtype from info", null);
    int i = localCursor.getCount();
    int j = 0;
    if (i > 0)
    {
      localCursor.moveToFirst();
      j = localCursor.getInt(0);
    }
    localCursor.close();
    if (j == 0)
      j = 1;
    return j;
  }

  public g b(int paramInt)
  {
    Cursor localCursor = this.b.rawQuery("SELECT * FROM dvmd WHERE id = " + paramInt, null);
    int i = localCursor.getCount();
    int j = 0;
    g localg = null;
    if (i > 0)
    {
      localCursor.moveToFirst();
      localg = new g();
      localg.a = localCursor.getInt(0);
      localg.b = localCursor.getInt(1);
      j = localCursor.getInt(3);
    }
    localCursor.close();
    if (j == 0)
      j = localg.a;
    if (localg != null)
      localg.d = f(j);
    return localg;
  }

  public ArrayList c(int paramInt)
  {
    String str = "SELECT * FROM brand A WHERE categoryid = " + paramInt + " AND (SELECT COUNT(*) FROM dvmd B WHERE A.id = B.bid) > 0 ORDER BY priority,name";
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.b.rawQuery(str, null);
    while (localCursor.moveToNext())
    {
      d locald = new d();
      locald.a = localCursor.getInt(0);
      locald.c = localCursor.getString(1);
      locald.b = localCursor.getInt(2);
      locald.d = localCursor.getInt(3);
      localArrayList.add(locald);
    }
    localCursor.close();
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

  public int[] d(int paramInt)
  {
    String str = "SELECT id FROM dvmd WHERE bid = " + paramInt + " ORDER BY id";
    Cursor localCursor = this.b.rawQuery(str, null);
    int[] arrayOfInt = new int[localCursor.getCount()];
    int j;
    for (int i = 0; localCursor.moveToNext(); i = j)
    {
      j = i + 1;
      arrayOfInt[i] = localCursor.getInt(0);
    }
    localCursor.close();
    return arrayOfInt;
  }

  public ArrayList e(int paramInt)
  {
    String str = "SELECT * FROM dvfnc WHERE mid = " + paramInt + " ORDER BY id";
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.b.rawQuery(str, null);
    while (localCursor.moveToNext())
    {
      h localh = new h();
      localh.a = localCursor.getInt(2);
      localh.b = localCursor.getBlob(3);
      localArrayList.add(localh);
    }
    localCursor.close();
    return localArrayList;
  }

  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
  }

  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.remotelib.e
 * JD-Core Version:    0.6.2
 */