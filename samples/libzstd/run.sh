java --enable-native-access=ALL-UNNAMED \
   --enable-preview --source=20 \
   -Djava.library.path="$(brew --prefix zstd)/lib" LibzstdMain.java
