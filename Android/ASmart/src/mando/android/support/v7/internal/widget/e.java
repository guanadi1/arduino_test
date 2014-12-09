package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class e
  implements Parcelable.Creator
{
  public AbsSpinnerICS.SavedState a(Parcel paramParcel)
  {
    return new AbsSpinnerICS.SavedState(paramParcel, null);
  }

  public AbsSpinnerICS.SavedState[] a(int paramInt)
  {
    return new AbsSpinnerICS.SavedState[paramInt];
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.e
 * JD-Core Version:    0.6.2
 */