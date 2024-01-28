// script does not make sense, but it works
// from: https://github.com/qupath/qupath/issues/158
// this can also be done manually for each slide: right-click > Set class > ROI

def tumor = getPathClass('ROI')
def stroma = getPathClass('ROI')
getAnnotationObjects().eachWithIndex { annotation , i ->
   if (i % 2 == 0)
      annotation.setPathClass(tumor)
  else
      annotation.setPathClass(stroma)
}
fireHierarchyUpdate()