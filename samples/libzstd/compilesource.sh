jextract --source -t libzstd \
  -I /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include \
  -I /usr/local/Cellar/zstd/1.5.2/include \
  -l zstd \
  --header-class-name Libzstd \
  /usr/local/Cellar/zstd/1.5.2/include/zstd.h

javac --enable-preview --source=20 libzstd/*.java
