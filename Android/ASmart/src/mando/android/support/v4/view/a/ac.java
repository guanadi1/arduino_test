package android.support.v4.view.a;

import android.view.accessibility.AccessibilityRecord;

class ac
{
  public static Object a()
  {
    return AccessibilityRecord.obtain();
  }

  public static void a(Object paramObject, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setFromIndex(paramInt);
  }

  public static void a(Object paramObject, boolean paramBoolean)
  {
    ((AccessibilityRecord)paramObject).setScrollable(paramBoolean);
  }

  public static void b(Object paramObject, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setItemCount(paramInt);
  }

  public static void c(Object paramObject, int paramInt)
  {
    ((AccessibilityRecord)paramObject).setToIndex(paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.ac
 * JD-Core Version:    0.6.2
 */