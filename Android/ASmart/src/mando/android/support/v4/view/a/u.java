package android.support.v4.view.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class u extends AccessibilityNodeProvider
{
  u(v paramv)
  {
  }

  public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
  {
    return (AccessibilityNodeInfo)this.a.a(paramInt);
  }

  public List findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    return this.a.a(paramString, paramInt);
  }

  public AccessibilityNodeInfo findFocus(int paramInt)
  {
    return (AccessibilityNodeInfo)this.a.b(paramInt);
  }

  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.a.a(paramInt1, paramInt2, paramBundle);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.u
 * JD-Core Version:    0.6.2
 */