package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class i
  implements Parcelable.Creator
{
  public DrawerLayout.SavedState a(Parcel paramParcel)
  {
    return new DrawerLayout.SavedState(paramParcel);
  }

  public DrawerLayout.SavedState[] a(int paramInt)
  {
    return new DrawerLayout.SavedState[paramInt];
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.i
 * JD-Core Version:    0.6.2
 */