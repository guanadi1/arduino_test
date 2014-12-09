package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

class am
  implements ListAdapter, SpinnerAdapter
{
  private SpinnerAdapter a;
  private ListAdapter b;

  public am(SpinnerAdapter paramSpinnerAdapter)
  {
    this.a = paramSpinnerAdapter;
    if ((paramSpinnerAdapter instanceof SpinnerAdapter))
      this.b = ((SpinnerAdapter)paramSpinnerAdapter);
  }

  public boolean areAllItemsEnabled()
  {
    ListAdapter localListAdapter = this.b;
    if (localListAdapter != null)
      return localListAdapter.areAllItemsEnabled();
    return true;
  }

  public int getCount()
  {
    if (this.a == null)
      return 0;
    return this.a.getCount();
  }

  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.a == null)
      return null;
    return this.a.getDropDownView(paramInt, paramView, paramViewGroup);
  }

  public Object getItem(int paramInt)
  {
    if (this.a == null)
      return null;
    return this.a.getItem(paramInt);
  }

  public long getItemId(int paramInt)
  {
    if (this.a == null)
      return -1L;
    return this.a.getItemId(paramInt);
  }

  public int getItemViewType(int paramInt)
  {
    return 0;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return getDropDownView(paramInt, paramView, paramViewGroup);
  }

  public int getViewTypeCount()
  {
    return 1;
  }

  public boolean hasStableIds()
  {
    return (this.a != null) && (this.a.hasStableIds());
  }

  public boolean isEmpty()
  {
    return getCount() == 0;
  }

  public boolean isEnabled(int paramInt)
  {
    ListAdapter localListAdapter = this.b;
    if (localListAdapter != null)
      return localListAdapter.isEnabled(paramInt);
    return true;
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.a != null)
      this.a.registerDataSetObserver(paramDataSetObserver);
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.a != null)
      this.a.unregisterDataSetObserver(paramDataSetObserver);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.am
 * JD-Core Version:    0.6.2
 */