package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class j
  implements Parcelable.Creator
{
  public ActionBarView.SavedState a(Parcel paramParcel)
  {
    return new ActionBarView.SavedState(paramParcel, null);
  }

  public ActionBarView.SavedState[] a(int paramInt)
  {
    return new ActionBarView.SavedState[paramInt];
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.j
 * JD-Core Version:    0.6.2
 */