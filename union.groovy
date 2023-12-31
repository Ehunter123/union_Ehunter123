double size =80;
CSG cube = new Cube(	size,// X dimention
			size,// Y dimention
			size//  Z dimention
			).toCSG()
cube.setName("cube")		
//create a sphere
CSG sphere = new Sphere(size/60*12.5).toCSG()
sphere.setName("sphere")
// perform a union
CSG cubePlusSphere = cube.union(sphere);
cubePlusSphere.setName("Assembly") 
println cubePlusSphere.name
println cube.name
println sphere.name
//To union a list of CSG's together use the static unioAll
CSG allUnion = CSG.unionAll([cubePlusSphere , cube.movex(size*1.5), sphere.movey(size*1.5)])

return allUnion