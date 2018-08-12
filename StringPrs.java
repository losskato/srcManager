
public class StringPrs {

	private String firstName;
	private String familyName;

	public StringPrs() {
		// TODO 自動生成されたコンストラクター・スタブ

		this("谷内","淳一郎1");

	}

	public StringPrs(String s ) {

		this(s,"淳一郎");

	}

	public StringPrs(String s ,String s1) {

        setFamilyName(s);
        setFirstName(s1);

	}

    public void setFirstName(String s) {

    	if (s.length() >= 6) {

    		throw new IllegalArgumentException("5文字以下で入力してください");

    	}

    	firstName = s;

    }

	public String getFirstName() {

		return firstName;

	}

    public void setFamilyName(String s) {

    	if (s.length() >= 6) {

    		throw new IllegalArgumentException("5文字以下で入力してください");

    	}

    	familyName = s;

    }

	public String getFamilyName() {

		return familyName;

	}



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		StringBuilder s = new StringBuilder();
        String[] a;

		for(int i = 1 ;i <= 100;i++ ) {

			s.append(i).append(",");
		}

		System.out.println(s.toString());

		a = s.toString().split("[,;]");

		for(int j = 0; j < a.length; j ++) {

			System.out.println(a[j]);

		}

		String fPath = formatPath("C:\\javadev","readme.txt");

		System.out.println(fPath);


		boolean bl = formatMatch("UAB");

		if (bl){ System.out.println("マッチ");}else {System.out.println("マッチしない");}


		//自クラスのインスタンス化
		StringPrs sp = new StringPrs();

		System.out.println(sp.toString());
	}

	public static String formatPath(String folder,String file){

        if (!folder.endsWith("\\")) {

        	folder += "\\";

        }

        return folder + file;

	}

	public static boolean formatMatch(String s) {

		boolean bl;

		bl = s.matches(".*");
		bl = s.matches("^A[0-9]{1,2}$");
		bl = s.matches("^U[A-Z]{1,3}$");

		return bl;
	}

	public String toString() {

		return "私の名前は" + getFamilyName() + getFirstName()+ "です";
	}

}
