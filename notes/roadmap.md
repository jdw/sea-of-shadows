### Roadmap for the library Sea of Shadows - Rendering WebGL on the backend
- [ ] Clear screen barebones example PoC 
- [ ] Browser terminal in beta
- [ ] Write a CLI that parses Mozilla's different available [API's](https://developer.mozilla.org/en-US/docs/Web/API) 
- [ ] Rotating cube
- [ ] Canvas2d fully mapped
- [ ] WebGL v1 fully mapped
- [ ] Terminal loading settings from "/seaofshadows-settings.json" REST GET 
- [ ] Resize/tab close/input/window.location.href from/to terminal
- [ ] A WebGL example or two ported to Sea of Shadows
- [ ] WebGL v2 fully mapped
- [ ] Router for assets - load assets from terminal or server
- [ ] Browser terminal fully implemented
- [ ] Kotlin version of Three.js
- [ ] Multiple scenes rendered to multiple canvas elements in a browser terminal
- [ ] WebGPU v1 mapped
- [ ] A UI library mapped or implemented
- [ ] Visual profiler/network monitor/injector
- [ ] Messages over REST
- [ ] Messages over SSE

### Terminals
#### These does probably not support WebGL out-of-the-box so we would need to roll our own wrapper for OpenGL ES
Would a wrapper be needed for WebGPU rendering? How about keeping these WebGPU only? 
- [ ] Android terminal
- [ ] MacOS terminal
- [ ] iOS terminal
- [ ] Linux terminal
- [ ] Perchance a Windows x64 terminal

### Lofty goals
A simple man must but dream.
- [ ] A Quake 3 demo based on this one [here](https://media.tojicode.com/q3bsp/)
- [ ] [Three.js](https://threejs.org/) ported as a proper Kotlin library
- [ ] [Babylon.js](https://www.babylonjs.com/) ported as a proper Kotlin library
- [ ] The Winter Cardinal UI [library](https://github.com/winter-cardinal/winter-cardinal-ui) library ported as a proper Kotlin library
- [ ] [Pixi.js](https://github.com/pixijs/pixijs) ported as a proper Kotlin library