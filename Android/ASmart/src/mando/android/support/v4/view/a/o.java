package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

class o
  implements v
{
  o(n paramn, j paramj)
  {
  }

  public Object a(int paramInt)
  {
    a locala = this.a.a(paramInt);
    if (locala == null)
      return null;
    return locala.a();
  }

  public List a(String paramString, int paramInt)
  {
    List localList = this.a.a(paramString, paramInt);
    ArrayList localArrayList = new ArrayList();
    int i = localList.size();
    for (int j = 0; j < i; j++)
      localArrayList.add(((a)localList.get(j)).a());
    return localArrayList;
  }

  public boolean a(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.a.a(paramInt1, paramInt2, paramBundle);
  }

  public Object b(int paramInt)
  {
    a locala = this.a.b(paramInt);
    if (locala == null)
      return null;
    return locala.a();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.o
 * JD-Core Version:    0.6.2
 */