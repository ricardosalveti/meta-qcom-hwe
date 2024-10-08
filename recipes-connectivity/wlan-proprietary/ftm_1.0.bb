inherit qprebuilt pkgconfig

LICENSE          = "Qualcomm-Technologies-Inc.-Proprietary"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}${LICENSE};md5=58d50a3d36f27f1a1e6089308a49b403"

DESCRIPTION = "Qualcomm Technologies ftmdaemon"

DEPENDS += "libnl diag glib-2.0 property-vault ath6kl-utils"

RDEPENDS:${PN} = "property-vault"

PV = "1.0"

PBT_ARCH = "armv8-2a"

SRC_URI[armv8-2a.sha256sum] = "55df3b5af2602df7191d8a15ab5c1752e1fc06e0949e56a40fc83885cdb13f9e"

SRC_URI = "https://${PBT_ARTIFACTORY}/${PBT_BUILD_ID}/${PBT_BIN_PATH}/${BPN}_${PV}_${PBT_ARCH}.tar.gz;name=${PBT_ARCH}"
