package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class v
  implements Parcelable.Creator
{
  public FragmentTabHost.SavedState a(Parcel paramParcel)
  {
    return new FragmentTabHost.SavedState(paramParcel, null);
  }

  public FragmentTabHost.SavedState[] a(int paramInt)
  {
    return new FragmentTabHost.SavedState[paramInt];
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.v
 * JD-Core Version:    0.6.2
 */