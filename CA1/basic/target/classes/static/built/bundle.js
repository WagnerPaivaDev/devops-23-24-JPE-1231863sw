/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, { enumerable: true, get: getter });
/******/ 		}
/******/ 	};
/******/
/******/ 	// define __esModule on exports
/******/ 	__webpack_require__.r = function(exports) {
/******/ 		if(typeof Symbol !== 'undefined' && Symbol.toStringTag) {
/******/ 			Object.defineProperty(exports, Symbol.toStringTag, { value: 'Module' });
/******/ 		}
/******/ 		Object.defineProperty(exports, '__esModule', { value: true });
/******/ 	};
/******/
/******/ 	// create a fake namespace object
/******/ 	// mode & 1: value is a module id, require it
/******/ 	// mode & 2: merge all properties of value into the ns
/******/ 	// mode & 4: return value when already ns object
/******/ 	// mode & 8|1: behave like require
/******/ 	__webpack_require__.t = function(value, mode) {
/******/ 		if(mode & 1) value = __webpack_require__(value);
/******/ 		if(mode & 8) return value;
/******/ 		if((mode & 4) && typeof value === 'object' && value && value.__esModule) return value;
/******/ 		var ns = Object.create(null);
/******/ 		__webpack_require__.r(ns);
/******/ 		Object.defineProperty(ns, 'default', { enumerable: true, value: value });
/******/ 		if(mode & 2 && typeof value != 'string') for(var key in value) __webpack_require__.d(ns, key, function(key) { return value[key]; }.bind(null, key));
/******/ 		return ns;
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = "./src/main/js/app.js");
/******/ })
/************************************************************************/
/******/ ({

/***/ "./src/main/js/app.js":
/*!****************************!*\
  !*** ./src/main/js/app.js ***!
  \****************************/
/*! no static exports found */
/***/ (function(module, exports) {

throw new Error("Module build failed (from ./node_modules/babel-loader/lib/index.js):\nSyntaxError: /Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/src/main/js/app.js: Identifier 'EmployeeList' has already been declared. (54:6)\n\n  52 |\n  53 | // tag::employee-list[]\n> 54 | class EmployeeList extends React.Component{\n     |       ^\n  55 | \trender() {\n  56 | \t\tconst employees = this.props.employees.map(employee =>\n  57 | \t\t\t<Employee key={employee._links.self.href} employee={employee}/>\n    at constructor (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:353:19)\n    at JSXParserMixin.raise (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:3277:19)\n    at ScopeHandler.checkRedeclarationInScope (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:1491:19)\n    at ScopeHandler.declareName (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:1457:12)\n    at JSXParserMixin.declareNameFromIdentifier (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:7348:16)\n    at JSXParserMixin.parseClassId (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:13238:14)\n    at JSXParserMixin.parseClass (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:12946:10)\n    at JSXParserMixin.parseStatementContent (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:12266:21)\n    at JSXParserMixin.parseStatementLike (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:12239:17)\n    at JSXParserMixin.parseModuleItem (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:12216:17)\n    at JSXParserMixin.parseBlockOrModuleBlockBody (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:12796:36)\n    at JSXParserMixin.parseBlockBody (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:12789:10)\n    at JSXParserMixin.parseProgram (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:12116:10)\n    at JSXParserMixin.parseTopLevel (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:12106:25)\n    at JSXParserMixin.parse (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:13905:10)\n    at parse (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/parser/lib/index.js:13947:38)\n    at parser (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/core/lib/parser/index.js:41:34)\n    at parser.next (<anonymous>)\n    at normalizeFile (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/core/lib/transformation/normalize-file.js:64:37)\n    at normalizeFile.next (<anonymous>)\n    at run (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/core/lib/transformation/index.js:21:50)\n    at run.next (<anonymous>)\n    at transform (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/core/lib/transform.js:22:33)\n    at transform.next (<anonymous>)\n    at step (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/gensync/index.js:261:32)\n    at /Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/gensync/index.js:273:13\n    at async.call.result.err.err (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/gensync/index.js:223:11)\n    at /Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/gensync/index.js:189:28\n    at /Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/@babel/core/lib/gensync-utils/async.js:67:7\n    at /Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/gensync/index.js:113:33\n    at step (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/gensync/index.js:287:14)\n    at /Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/gensync/index.js:273:13\n    at async.call.result.err.err (/Users/WagnerPaiva/Documents/GitHub/devops-23-24-JPE-1231863sw/CA1/basic/node_modules/gensync/index.js:223:11)");

/***/ })

/******/ });
//# sourceMappingURL=bundle.js.map