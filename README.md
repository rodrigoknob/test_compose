To run via jpackage, execute scripts create_package.sh inside jpackage_manual directory, then will create a .deb file inside this directory.

To run via plugin compose, execute task ./gradlew package in root project terminal, then will create a .deb file insite build/compose/binaries/main/deb

When execute installer for jpackage_manual, script postisnt are running normaly, but when execute installer generated by compose, nothing happens.