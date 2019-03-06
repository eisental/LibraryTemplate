README
-------

Template project for a [RedstoneChips](http://github.com/eisental/RedstoneChips) circuit library.
The template contains everything necessary to compile a circuit library including one sample circuit. 

Usage
-------
- Download the latest RedstoneChips [source code](https://github.com/eisental/RedstoneChips/zipball/master).
- Download the [template source code](https://github.com/eisental/LibraryTemplate/zipball/master).
- Download and install [maven](http://maven.apache.org/).
- Compile RedstoneChips and install it into your local Maven repository by running 'mvn package install' within the root source folder (where the pom.xml file is located).
- Compile the template project run 'mvn package' while inside the LibraryTemplate folder to make sure everything works. The compiled jar file is created inside the target/ folder. 
- Customize the template: 
	- Rename the folder name, package names and the LibraryTemplate.java to fit your new library. 
	- Edit pom.xml to work with your new names.
	- Edit src/main/resources/plugin.yml.
- Write your circuits! See [test.java](https://github.com/eisental/LibraryTemplate/blob/master/src/main/java/org/tal/librarytemplate/test.java) for a simple example.

NOTE: If you're using NetBeans you can load the template project by clicking on "Open Project..." and choosing the LibraryTemplate/ folder. It should have an ma-like icon. Netbeans will let you conveniently refactor all the necessary names in the project.

