This is for me to read later, in terms of an item json file and how it works:

"parent": "minecraft:item/generated" tells minecraft to make a 3D model for the item. It takes the texture and extrudes it to create a 3D object (thats why when you hold an item in your hand, each pixel of the image is a 3D cube)

  "textures": { }  this provides a list of textures for the item to use in certain situations (for example i would assume the fluxbore item in thermal innovation would switch between different textures when holding mouse button down (drill is spinning)

    "layer0": "secondmod:item/copper_ingot"  this tells minecraft that layer0, in this case the default texture, is in secondmod:item (i think the colon indicates that this is being searched for relative to secondmod/models) and from there it looks for an image (any image type will do?) with the same name and accepts it

    Apologies for the spiel but I really want some documentation around so I can fully comprehend all of this



Addendum - blocks
  "parent": "secondmod:block/black_opal_block" : might be wrong but I believe this tells the game that the item is a block so it is able to read the json file provided in the same line and use the texture/s as well as the parent in said file (cube_all) to generate a 3D block model instead of an item model