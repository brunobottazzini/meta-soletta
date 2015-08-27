#
# Soletta image
#

SUMMARY = "A console-only image with built-in soletta"
LICENSE = "BSD"

#IMAGE_INSTALL += "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} kernel-modules"

SRC_URI += "file://grub.conf"

#IMAGE_INSTALL += "soletta lss python3 python3-jsonschema"
IMAGE_INSTALL += "soletta lss glib-2.0"

require recipes-core/images/image-full-galileo.bb

#inherit core-image
