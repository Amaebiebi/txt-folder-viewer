# mavenについて学んだこと

mavenを使用してJavaFX用のプロジェクトを生成した。
JAVA_HOMEとMAVEN(bin)のpathを通しておく必要がある。

プロジェクト生成に使用したコマンド
mvn archetype:generate -DarchetypeGroupId=org.openjfx -DarchetypeArtifactId=javafx-archetype-fxml -DgroupId=com.example -DartifactId=txt-folder-viewer -DinteractiveMode=false

オプションの詳細
- DarchetypeGroupId
	archetypeの提供元。
	
- DarchetypeArtifactId
	提供されているarchetypeを選択。
	
- DgroupId
	groupidを書く。
	
- DartifactId
	artifactidを書く。生成されるフォルダの名前になる。
	
- DinteractiveMode
	対話モード(true)か非対話モード(false)かを選択
	非対話モードの場合、プロジェクトが対話なしで一度に生成される

## 使ったコマンド
- mvn clean package
- mvn clean javafx:run



