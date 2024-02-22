package the_bloater.large_class;

import java.awt.Frame;

public class DuplicateObservedData {
	public static void main(String args[]) {
		new DuplicateObservedData().test();
	}

	void test() {
		var a = new IntervalWindow();
		System.out.println("run");
	}

	class Interval {
		private int start;
		private int end;
		private int length;

		public int getStart() {
			return start;
		}

		public void setStart(String start) {
			try {
				this.start = Integer.parseInt(start);
			} catch (NumberFormatException ex) {
				this.start = 0;
			}
		}

		public int getEnd() {
			return end;
		}

		public void setEnd(String end) {
			try {
				this.end = Integer.parseInt(end);
			} catch (NumberFormatException ex) {
				this.end = 0;
			}
		}

		public int getLength() {
			return length;
		}

		public void setLength(String length) {
			try {
				this.length = Integer.parseInt(length);
			} catch (NumberFormatException ex) {
				this.length = 0;
			}
		}

		void calculateLength() {
			length = end - start;
		}

		void calculateEnd() {
			end = start + length;
		}
	}

	class IntervalWindow extends Frame {
		java.awt.TextField startField;
		java.awt.TextField endField;
		java.awt.TextField lengthField;
		private Interval interval;

		public IntervalWindow() {
			startField = new java.awt.TextField();
			endField = new java.awt.TextField();
			lengthField = new java.awt.TextField();
			interval = new Interval();
			SymFocus focusListener = new SymFocus();
			startField.addFocusListener(focusListener);
			endField.addFocusListener(focusListener);
			lengthField.addFocusListener(focusListener);
		}

		class SymFocus extends java.awt.event.FocusAdapter {
			public void focusLost(java.awt.event.FocusEvent event) {
				Object object = event.getSource();
				if (object == startField) {
					StartField_FocusLost(event);
				} else if (object == endField) {
					EndField_FocusLost(event);
				} else if (object == lengthField) {
					LengthField_FocusLost(event);
				}
			}

			void StartField_FocusLost(java.awt.event.FocusEvent event) {
				interval.setStart(startField.getText());
				startField.setText(interval.getStart() + "");
				interval.calculateLength();
				lengthField.setText(String.valueOf(interval.getLength()));
			}

			void EndField_FocusLost(java.awt.event.FocusEvent event) {
				interval.setEnd(endField.getText());
				endField.setText(interval.getEnd() + "");
				interval.calculateLength();
				lengthField.setText(String.valueOf(interval.getLength()));
			}

			void LengthField_FocusLost(java.awt.event.FocusEvent event) {
				interval.setLength(lengthField.getText());
				lengthField.setText(interval.getLength() + "");
				interval.calculateEnd();
				endField.setText(String.valueOf(interval.getEnd()));
			}
		}
	}
}