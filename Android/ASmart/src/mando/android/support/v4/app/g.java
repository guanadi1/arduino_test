package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class g
  implements Parcelable.Creator
{
  public Fragment.SavedState a(Parcel paramParcel)
  {
    return new Fragment.SavedState(paramParcel, null);
  }

  public Fragment.SavedState[] a(int paramInt)
  {
    return new Fragment.SavedState[paramInt];
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.g
 * JD-Core Version:    0.6.2
 */