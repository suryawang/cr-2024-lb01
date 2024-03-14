package the_dispensable;

public class FormTemplateMethod {
	class Article {
		private String title;
		private String intro;
		private String body;

		public Article(String title, String intro, String body, String author, String date) {
			this.title = title;
			this.intro = intro;
			this.body = body;
			this.author = author;
			this.date = date;
		}

		private String author;
		private String date;

		public String getTitle() {
			return title;
		}

		public String getIntro() {
			return intro;
		}

		public String getBody() {
			return body;
		}

		public String getAuthor() {
			return author;
		}

		public String getDate() {
			return date;
		}

		public String markdownView() {
			String output = "# " + getTitle() + "\n\n";
			output += "> " + getIntro() + "\n\n";
			output += getBody() + "\n\n";
			output += "_Written by " + getAuthor() + " on " + getDate() + "_";
			return output;
		}

		public String htmlView() {
			String output = "<h2>" + getTitle() + "</h2>" + "\n";
			output += "<blockquote>" + getIntro() + "</blockquote>" + "\n";
			output += "<p>" + getBody() + "</p>" + "\n";
			output += "<em>Written by " + getAuthor() + " on " + getDate() + "</em>";
			return output;
		}
	}

	void test() {
		Article ar = new Article("China commercial property woes trigger surge in distressed sales",
				"More than a fifth of commercial deals involve real estate put into receivership",
				"HONG KONG -- Distressed sales made up more than a fifth of Chinese commercial real estate deals in 2023, underscoring the severity of the property crisis in Asia's largest economy.",
				"ECHO WONG", "March 14, 2024 14:47 JST");
		System.out.println(ar.markdownView());
		System.out.println(ar.htmlView());
	}

	public static void main(String[] a) {
		new FormTemplateMethod().test();
	}
}
