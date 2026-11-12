import sys

from PySide6.QtWidgets import QApplication, QMainWindow, QLabel, QWidget, QVBoxLayout,QPushButton

from ui_form import Ui_MainWindow

class MainWindow(QMainWindow):
    def __init__(self, parent=None):
        super().__init__(parent)
        self.ui = Ui_MainWindow()
        self.ui.setupUi(self)
        
        #土台のwidget
        central_widget = QWidget()

        #レイアウトを作成
        vbox = QVBoxLayout()

        #Widgetを作成してレイアウトに追加
        self.label1 = QLabel("Hello, world!")
        self.label2 = QLabel("Hello, world2!")
        self.label3 = QLabel("Hello, world3!")
        button = QPushButton("押してね")

        vbox.addWidget(self.label1)
        vbox.addWidget(self.label2)
        vbox.addWidget(self.label3)
        vbox.addWidget(button)

        #土台にレイアウトをセット
        central_widget.setLayout(vbox)

        #メインウィンドウの中央に土台を配置
        self.setCentralWidget(central_widget)

if __name__ == "__main__":
    app = QApplication(sys.argv)

    widget = MainWindow()
    widget.show()

    sys.exit(app.exec())