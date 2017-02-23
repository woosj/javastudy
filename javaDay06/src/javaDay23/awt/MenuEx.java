package javaDay23.awt;

import java.awt.*;

public class MenuEx extends Frame {
	
	private Label la = new Label("라벨");
	private Button bt = new Button("확인");
	
	//메뉴바 인스턴스 생성
	private MenuBar mb = new MenuBar();
	private Menu file = new Menu("파일");
	private Menu edit = new Menu("도구");
	private Menu view = new Menu("보기");
	private Menu help = new Menu("도움말");
	
	private MenuItem fnew = new MenuItem("새파일");
	private MenuItem fopen = new MenuItem("파일열기");
	private MenuItem fsave = new MenuItem("파일저장");
	private MenuItem fsaveas = new MenuItem("다른이름으로저장");
	private MenuItem fexit = new MenuItem("나가기");
	
	private Menu ecolor = new Menu("색상");
	private Menu esize = new Menu("크기");
	
	private CheckboxMenuItem ecred = new CheckboxMenuItem("빨강");
	private CheckboxMenuItem ecgreen = new CheckboxMenuItem("그린");
	private CheckboxMenuItem ecblue = new CheckboxMenuItem("파랑");
	
	private CheckboxMenuItem es10 =  new CheckboxMenuItem("10");
	private CheckboxMenuItem es20 =  new CheckboxMenuItem("20");
	private CheckboxMenuItem es30 =  new CheckboxMenuItem("30");
	
	public MenuEx() {
		// TODO Auto-generated constructor stub
		super("메뉴와 패널");
		
		setMenuBar(mb);
		
		mb.add(file);
		mb.add(edit);
		mb.add(view);
		mb.add(help);
		
		file.add(fnew);
		file.addSeparator();
		file.add(fopen);
		file.add(fsave);
		file.add(fsaveas);
		file.addSeparator();
		file.add(fexit);
		
		edit.add(ecolor);
		edit.addSeparator();
		edit.add(esize);
		
		ecolor.add(ecred);
		ecolor.add(ecgreen);
		ecolor.add(ecblue);
		
		esize.add(es10);
		esize.add(es20);
		esize.add(es30);
		
		
		
		setLayout(new BorderLayout());
		
		add("North",new Label("수고",Label.CENTER));
		add("Center", new TextArea());
		
		Panel p = new Panel(new GridLayout(1, 2));
		p.add(new Button("확인"));
		p.add(new Button("취소"));
		
		add("South",p);
		
		setSize(400, 400);
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEx();
	}

}
