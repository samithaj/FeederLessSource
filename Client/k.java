package Client;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

final class k
  extends MouseAdapter
{
  k(a parama) {}
  
  public final void mouseReleased(MouseEvent paramMouseEvent)
  {
    paramMouseEvent = (JLabel)paramMouseEvent.getSource();
    this.a.b(paramMouseEvent.getName());
  }
}


/* Location:              C:\Program Files (x86)\FeedLess-Alpha\Client.jar!\Client\k.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */