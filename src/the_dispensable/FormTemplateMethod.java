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
	}

	abstract class ArticleView {
		protected Article article;

		public ArticleView(Article article) {
			this.article = article;
		}

		abstract String title();

		abstract String intro();

		abstract String body();

		abstract String footer();

		public String view() {
			return title() + intro() + body() + footer();
		}
	}

	class MarkdownView extends ArticleView {
		public MarkdownView(Article article) {
			super(article);
		}

		String title() {
			return "# " + article.getTitle() + "\n\n";
		}

		String intro() {
			return "> " + article.getIntro() + "\n\n";
		}

		String body() {
			return article.getBody() + "\n\n";
		}

		String footer() {
			return "_Written by " + article.getAuthor() + " on " + article.getDate() + "_";
		}
	}

	class HtmlView extends ArticleView {
		public HtmlView(Article article) {
			super(article);
		}

		String title() {
			return "<h2>" + article.getTitle() + "</h2>" + "\n";
		}

		String intro() {
			return "<blockquote>" + article.getIntro() + "</blockquote>" + "\n";
		}

		String body() {
			return "<p>" + article.getBody() + "</p>" + "\n";
		}

		String footer() {
			return "<em>Written by " + article.getAuthor() + " on " + article.getDate() + "</em>";
		}
	}

	class CsvView extends ArticleView {
		public CsvView(Article article) {
			super(article);
		}

		String title() {
			return article.getTitle() + ",";
		}

		String intro() {
			return article.getIntro() + ",";
		}

		String body() {
			return article.getBody() + ",";
		}

		String footer() {
			return article.getAuthor() + "," + article.getDate();
		}
	}

	void test() {
		Article ar = new Article("China commercial property woes trigger surge in distressed sales",
				"More than a fifth of commercial deals involve real estate put into receivership",
				"HONG KONG -- Distressed sales made up more than a fifth of Chinese commercial real estate deals in 2023, underscoring the severity of the property crisis in Asia's largest economy.",
				"ECHO WONG", "March 14, 2024 14:47 JST");
		System.out.println(new MarkdownView(ar).view());
		System.out.println(new HtmlView(ar).view());
		System.out.println(new CsvView(ar).view());
	}

	public static void main(String[] a) {
		new FormTemplateMethod().test();
	}
}
