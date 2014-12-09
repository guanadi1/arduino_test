package android.support.v7.internal.view.menu;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class h
  implements Parcelable.Creator
{
  public ActionMenuPresenter.SavedState a(Parcel paramParcel)
  {
    return new ActionMenuPresenter.SavedState(paramParcel);
  }

  public ActionMenuPresenter.SavedState[] a(int paramInt)
  {
    return new ActionMenuPresenter.SavedState[paramInt];
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.view.menu.h
 * JD-Core Version:    0.6.2
 */