import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Notepad implements ActionListener 
{
	String s="";
	Frame f;
	MenuBar mb;
	Menu fi,ed,fo,fon,co,st,si;
	MenuItem ne,op,sa,ex,cu,cp,pa,bo,it,pl,te,tw,th,bac,foc;
	TextArea ta;
	Notepad()
	{
		f=new Frame("notepad");
		ta=new TextArea();
		mb=new MenuBar();
		fi =new Menu("File");
		ed=new Menu("Edit");
		fo=new Menu("Format");
		fon=new Menu("Font");
		co=new Menu("Color");
		st=new Menu("Style");
		si=new Menu("Size");

		ne=new MenuItem("New"); 
		op=new MenuItem("Open");
		sa=new MenuItem("Save");
		ex=new MenuItem("Exit");
		cu=new MenuItem("Cut");
		cp=new MenuItem("Copy");
		pa=new MenuItem("Paste");
		bo=new MenuItem("Bold");
		it=new MenuItem("Italic");
		pl=new MenuItem("Plain");
		te=new MenuItem("10");
		tw=new MenuItem("20");
		th=new MenuItem("30");
		bac=new MenuItem("back");
		foc=new MenuItem("foc");

		fi.add(ne);
		fi.add(op);
		fi.add(sa);
		fi.add(ex);

		ed.add(cu);
		ed.add(cp);
		ed.add(pa);

		co.add(bac);
		co.add(foc);

		si.add(te);
		si.add(tw);
		si.add(th);

		st.add(bo);
		st.add(it);
		st.add(pl);
		fon.add(st);
		fon.add(si);
		fo.add(fon);
		fo.add(co);

		 //.add(fi);
		//.add(co);
		 mb.add(fi);
		 mb.add(ed);
		 mb.add(fo);
		 f.setMenuBar(mb);
		 f.add(ta);

		 ne.addActionListener(this);
		 op.addActionListener(this);
		 sa.addActionListener(this);
		 ex.addActionListener(this);
		 cu.addActionListener(this);
		 cp.addActionListener(this);
		 pa.addActionListener(this);
		 bo.addActionListener(this);
		 it.addActionListener(this);
		 pl.addActionListener(this);
		  te.addActionListener(this);
		   tw.addActionListener(this);
		    th.addActionListener(this);
		     bac.addActionListener(this);
		      foc.addActionListener(this);

		      f.setSize(800,600);
		      f.setVisible(true);
		  }

		      public void actionPerformed(ActionEvent e)
		      {
		      	if(e.getSource()==ne)
		      	{
		      		ta.setText("");
		      	}
		      	else if(e.getSource()==op)
		      	{
		      		JFileChooser jc=new JFileChooser();
		      		jc.showOpenDialog(f);
		      	}
		      	else if(e.getSource()==sa)
		      	{
		      		JFileChooser jc=new JFileChooser();
		      		jc.showSaveDialog(f);
		      	}
		      	else if(e.getSource()==ex)
		      	{
		      		System.exit(0);
		      	}
		      	else if(e.getSource()==cu)
		      	{
		      		s=ta.getSelectedText();
		      		int i=ta.getSelectionStart();
		      		int j=ta.getSelectionEnd();
		      		ta.replaceRange("",i,j);
		      	}
		      	else if(e.getSource()==cp)
		      	{
		      		s=ta.getSelectedText();
		      	}
		      	else if(e.getSource()==pa)
		      	{
		      		ta.insert(s,ta.getSelectionStart());
		      	}
		      	else if(e.getSource()==bo)
		      	{
		      		Font fo=new Font("Arail",Font.BOLD,20);
		      		ta.setFont(fo);
		      	}
		      	else if(e.getSource()==it)
		      	{
		      		Font fo=new Font("Arail",Font.ITALIC,20);
		      		ta.setFont(fo);
		      	}
		      	else if(e.getSource()==pl)
		      	{
		      	   Font fo=new Font("Arail",Font.PLAIN,20);
		      	   ta.setFont(fo);	
		      	}
		      	else if(e.getSource()==th)
		      	{
		      		Font fo=new Font("Arail",Font.PLAIN,30);
		      		ta.setFont(fo);
		      	}
		      	else if(e.getSource()==te)
		      	{
		      	   Font fo=new Font("Arail",Font.PLAIN,10);
		      		ta.setFont(fo);	
		      	}
		      	else if(e.getSource()==tw)
		      	{
		      	   Font fo=new Font("Arail",Font.PLAIN,20);
		      		ta.setFont(fo);	
		      	}
		      	else if(e.getSource()==bac)
		      	{
		      	   JColorChooser jc=new JColorChooser();
		      	   Color c=jc.showDialog(f,"Backcolor",Color.red);
		      	   ta.setBackground(c);
		      	}
		      	else if(e.getSource()==foc)
		      	{
		      	   JColorChooser jc=new JColorChooser();
		      	   Color c=jc.showDialog(f,"Forecolor",Color.red);
		      	   ta.setForeground(c);
		      	}

		      }
		      public static void main(String[] args) {
		      	note sc=new note();
		      }


}