# spring-boot-app-using-gradle

## How to generate `gradle.lockfile`
```bash
./gradlew dependencies --write-locks
```

## Run Source Scan
```bash
./gradlew build
grype dir:.
```

## Sample Source Scan Results
```console
$ grype dir:.
 ✔ Vulnerability DB        [no update available]
 ✔ Indexed .
 ✔ Cataloged packages      [20 packages]
 ✔ Scanned image           [8 vulnerabilities]
NAME              INSTALLED  FIXED-IN  VULNERABILITY        SEVERITY
log4j-api         2.14.1     2.15.0    GHSA-jfh8-c2jp-5v3q  Critical
log4j-api         2.14.1     2.16.0    GHSA-7rjr-3q55-vv33  Medium
log4j-api         2.14.1               CVE-2021-44228       Critical
log4j-core        2.14.1     2.15.0    GHSA-jfh8-c2jp-5v3q  Critical
log4j-core        2.14.1     2.16.0    GHSA-7rjr-3q55-vv33  Medium
log4j-core        2.14.1               CVE-2021-44228       Critical
log4j-jul         2.14.1               CVE-2021-44228       Critical
log4j-slf4j-impl  2.14.1               CVE-2021-44228       Critical
```

## Run Image Scan
```bash
./gradlew bootBuildImage
```

## Sample Image Scan Results
```console
$ grype docker.io/library/spring-boot-app-using-gradle:0.0.1-SNAPSHOT
 ✔ Vulnerability DB        [no update available]
 ✔ Loaded image
 ✔ Parsed image
 ✔ Cataloged packages      [167 packages]
 ✔ Scanned image           [67 vulnerabilities]

NAME              INSTALLED               FIXED-IN  VULNERABILITY        SEVERITY
bash              4.4.18-2ubuntu1.2                 CVE-2019-18276       Low
coreutils         8.28-1ubuntu1                     CVE-2016-2781        Low
gcc-8-base        8.4.0-1ubuntu1~18.04              CVE-2020-13844       Medium
gpgv              2.2.4-1ubuntu1.4                  CVE-2019-13050       Low
libc-bin          2.27-3ubuntu1.4                   CVE-2015-8985        Negligible
libc-bin          2.27-3ubuntu1.4                   CVE-2016-10739       Low
libc-bin          2.27-3ubuntu1.4                   CVE-2020-6096        Low
libc-bin          2.27-3ubuntu1.4                   CVE-2021-3326        Low
libc-bin          2.27-3ubuntu1.4                   CVE-2020-27618       Low
libc-bin          2.27-3ubuntu1.4                   CVE-2019-25013       Low
libc-bin          2.27-3ubuntu1.4                   CVE-2021-35942       Medium
libc-bin          2.27-3ubuntu1.4                   CVE-2021-33574       Low
libc-bin          2.27-3ubuntu1.4                   CVE-2021-38604       Medium
libc-bin          2.27-3ubuntu1.4                   CVE-2016-10228       Negligible
libc-bin          2.27-3ubuntu1.4                   CVE-2009-5155        Negligible
libc6             2.27-3ubuntu1.4                   CVE-2015-8985        Negligible
libc6             2.27-3ubuntu1.4                   CVE-2016-10739       Low
libc6             2.27-3ubuntu1.4                   CVE-2020-6096        Low
libc6             2.27-3ubuntu1.4                   CVE-2021-3326        Low
libc6             2.27-3ubuntu1.4                   CVE-2020-27618       Low
libc6             2.27-3ubuntu1.4                   CVE-2019-25013       Low
libc6             2.27-3ubuntu1.4                   CVE-2021-35942       Medium
libc6             2.27-3ubuntu1.4                   CVE-2021-33574       Low
libc6             2.27-3ubuntu1.4                   CVE-2021-38604       Medium
libc6             2.27-3ubuntu1.4                   CVE-2016-10228       Negligible
libc6             2.27-3ubuntu1.4                   CVE-2009-5155        Negligible
libgcc1           1:8.4.0-1ubuntu1~18.04            CVE-2020-13844       Medium
libgnutls30       3.5.18-1ubuntu1.5                 CVE-2018-16868       Low
libncurses5       6.1-1ubuntu1.18.04                CVE-2019-17594       Negligible
libncurses5       6.1-1ubuntu1.18.04                CVE-2019-17595       Negligible
libncursesw5      6.1-1ubuntu1.18.04                CVE-2019-17594       Negligible
libncursesw5      6.1-1ubuntu1.18.04                CVE-2019-17595       Negligible
libpcre3          2:8.39-9                          CVE-2020-14155       Negligible
libpcre3          2:8.39-9                          CVE-2019-20838       Low
libpcre3          2:8.39-9                          CVE-2017-11164       Negligible
libstdc++6        8.4.0-1ubuntu1~18.04              CVE-2020-13844       Medium
libtasn1-6        4.13-2                            CVE-2018-1000654     Negligible
libtinfo5         6.1-1ubuntu1.18.04                CVE-2019-17594       Negligible
libtinfo5         6.1-1ubuntu1.18.04                CVE-2019-17595       Negligible
locales           2.27-3ubuntu1.4                   CVE-2015-8985        Negligible
locales           2.27-3ubuntu1.4                   CVE-2016-10739       Low
locales           2.27-3ubuntu1.4                   CVE-2020-6096        Low
locales           2.27-3ubuntu1.4                   CVE-2021-3326        Low
locales           2.27-3ubuntu1.4                   CVE-2020-27618       Low
locales           2.27-3ubuntu1.4                   CVE-2019-25013       Low
locales           2.27-3ubuntu1.4                   CVE-2021-35942       Medium
locales           2.27-3ubuntu1.4                   CVE-2021-33574       Low
locales           2.27-3ubuntu1.4                   CVE-2021-38604       Medium
locales           2.27-3ubuntu1.4                   CVE-2016-10228       Negligible
locales           2.27-3ubuntu1.4                   CVE-2009-5155        Negligible
log4j-api         2.14.1                  2.15.0    GHSA-jfh8-c2jp-5v3q  Critical
log4j-api         2.14.1                  2.16.0    GHSA-7rjr-3q55-vv33  Medium
log4j-api         2.14.1                            CVE-2021-44228       Critical
log4j-core        2.14.1                  2.15.0    GHSA-jfh8-c2jp-5v3q  Critical
log4j-core        2.14.1                  2.16.0    GHSA-7rjr-3q55-vv33  Medium
log4j-core        2.14.1                            CVE-2021-44228       Critical
log4j-jul         2.14.1                            CVE-2021-44228       Critical
log4j-slf4j-impl  2.14.1                            CVE-2021-44228       Critical
login             1:4.5-1ubuntu2                    CVE-2013-4235        Low
login             1:4.5-1ubuntu2                    CVE-2018-7169        Low
ncurses-base      6.1-1ubuntu1.18.04                CVE-2019-17594       Negligible
ncurses-base      6.1-1ubuntu1.18.04                CVE-2019-17595       Negligible
ncurses-bin       6.1-1ubuntu1.18.04                CVE-2019-17594       Negligible
ncurses-bin       6.1-1ubuntu1.18.04                CVE-2019-17595       Negligible
passwd            1:4.5-1ubuntu2                    CVE-2013-4235        Low
passwd            1:4.5-1ubuntu2                    CVE-2018-7169        Low
perl-base         5.26.1-6ubuntu0.5                 CVE-2020-16156       Medium
```
