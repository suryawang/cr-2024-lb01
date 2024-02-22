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
	class IntervalWindow extends Frame {
		java.awt.TextField startField;
		java.awt.TextField endField;
		java.awt.TextField lengthField;

		public IntervalWindow() {
			startField = new java.awt.TextField();
			endField = new java.awt.TextField();
			lengthField = new java.awt.TextField();
			SymFocus focusListener = new SymFocus();
			startField.addFocusListener(focusListener);
			endField.addFocusListener(focusListener);
			lengthField.addFocusListener(focusListener);
		}

		class SymFocus extends java.awt.event.FocusAdapter {
			boolean isNotInteger(String text) {
				try {
					Integer.parseInt(text);
					return true;
				} catch (NumberFormatException ex) {
					return false;
				}
			}

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
				if (isNotInteger(startField.getText())) {
					startField.setText("0");
				}
				calculateLength();
			}

			void EndField_FocusLost(java.awt.event.FocusEvent event) {
				if (isNotInteger(endField.getText())) {
					endField.setText("0");
				}
				calculateLength();
			}

			void LengthField_FocusLost(java.awt.event.FocusEvent event) {
				if (isNotInteger(lengthField.getText())) {
					lengthField.setText("0");
				}
				calculateEnd();
			}

			void calculateLength() {
				try {
					int start = Integer.parseInt(startField.getText());
					int end = Integer.parseInt(endField.getText());
					int length = end - start;
					lengthField.setText(String.valueOf(length));
				} catch (NumberFormatException e) {
					throw new RuntimeException("Unexpected Number Format Error");
				}
			}

			void calculateEnd() {
				try {
					int start = Integer.parseInt(startField.getText());
					int length = Integer.parseInt(lengthField.getText());
					int end = start + length;
					endField.setText(String.valueOf(end));
				} catch (NumberFormatException e) {
					throw new RuntimeException("Unexpected Number Format Error");
				}
			}
		}
	}
}